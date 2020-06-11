FROM ubuntu:18.04
COPY yang /root/yang
COPY config /root/config
COPY script /root/script
ENV DEBIAN_FRONTEND=noninteractive
RUN  apt-get update && apt-get upgrade -y \
    && sed  -i 's/# deb-src/deb-src/g' /etc/apt/sources.list && cat /etc/apt/sources.list \
    && apt-get update \
    && apt-get install build-essential fakeroot dpkg-dev -y \
    && apt-get build-dep git -y \
    && apt-get install libcurl4-openssl-dev curl git-man libpcre2-dev  -y \
    && apt remove --purge libcurl4-gnutls-dev -y || true \
    && apt-get autoremove -y \
    && echo 'STEP 1' \
    && apt-get autoclean \
    && apt install build-essential autoconf dh-autoreconf -y \
    && apt install libcurl4-openssl-dev tcl-dev gettext asciidoc -y \
    && apt install libexpat1-dev libz-dev -y \
    && echo 'STEP 2' \
    && mkdir -p "/tmp/source-git/" \
    && cd "/tmp/source-git/" \
    && apt-get source git  \
    && cd git-2.*.*/  \
    && echo 'STEP 3' \
    && sed -i -- 's/libcurl4-gnutls-dev/libcurl4-openssl-dev/' ./debian/control  \
    && sed -i -- '/TEST\s*=\s*test/d' ./debian/rules  \
    && dpkg-buildpackage -rfakeroot -b -uc -us  \
    && dpkg -i ../git_*ubuntu*.deb  \
    && apt-get install software-properties-common build-essential openssl libssl-dev libpcre3 libpcre3-dev make cmake bison flex pkg-config graphviz doxygen valgrind zlib1g zlib1g-dev libev-dev libavl-dev libprotobuf-c-dev protobuf-c-compiler swig python-dev lua5.2 vim net-tools libcurl4-openssl-dev man -y \
    && echo "export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib" >> ~/.bashrc \
    && export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib \
    && export GIT_SSL_NO_VERIFY=1 \
    && git config --global http.sslverify false \
    && cd ~ && git clone http://git.libssh.org/projects/libssh.git \
    && cd libssh && mkdir build && cd build \
    && git checkout stable-0.8 \
    && cmake .. && make -j4 && make install \
    && cd ~ &&  git clone https://git.cryptomilk.org/projects/cmocka.git \
    && cd cmocka && mkdir build && cd build \
    && git checkout tags/cmocka-1.0.1 \
    && cmake .. && make && make install \
    && cd ~ && git clone https://github.com/CESNET/libyang.git \
    && cd libyang && git checkout v1.0.176 \
    && mkdir build && cd build && cmake .. \
    && make -j4 && make install && make test -j4 \
    && cd ~ && git clone https://github.com/CESNET/libnetconf2.git \
    && cd libnetconf2 && git checkout v1.1.26 \
    && mkdir build && cd build && cmake -DENABLE_TLS=ON -DENABLE_SSH=ON .. \
    && make -j4 && make install \
    && cd ~ && git clone https://github.com/sysrepo/sysrepo.git \
    && cd sysrepo && git checkout v1.4.66 \
    && mkdir build && cd build \
    && cmake -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX:PATH=/usr .. \
    && make -j4 \
    && ctest && make install \
   &&  cd ~ && git clone https://github.com/CESNET/Netopeer2.git \
    && cd Netopeer2 && git checkout v1.1.34   \
    && mkdir build && cd build && cmake .. \
    && make && make install \
    && apt-get install openssh-client -y \
    && apt-get install libncurses5-dev libncursesw5-dev -y \
    && ssh-keygen -t rsa -b 2048 -f /etc/ssh/ssh_host_rsa_key \
    && sh -c 'echo root:root | chpasswd' \
    && cd /root/yang/openconfig-odtn && sh import-yangs.sh \
    && cd /root/script && python get-pip.py \
    && pip install netconf-console
EXPOSE 830
EXPOSE 22
EXPOSE 8080
WORKDIR /root
ENTRYPOINT ["sh", "/root/script/push-data.sh"]
