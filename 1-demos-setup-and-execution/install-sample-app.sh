
#!/usr/bin/env bash

ISTIO_VERSION=0.6.0
ISTIO_HOME=/home/ec2-user/istio-${ISTIO_VERSION}
export PATH="$PATH:${ISTIO_HOME}/bin"

cd ${ISTIO_HOME}

echo ${ISTIO_HOME}

oc project istio-system
${ISTIO_HOME}/bin/istioctl kube-inject -f samples/bookinfo/kube/bookinfo.yaml | oc apply -f -


