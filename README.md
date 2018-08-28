# Openshift Developer Focussed Demos

## Introduction
We have created several simple developer focussed Openshift Demos and recorded them [1]. There are 2 versions - a short one and a longer one. With each, we provide an introduction as well as instructions to set them up and demo them yourself.

## Main demonstrations
With each demonstration, we provide you with a brief description as well as the starting time in the video for that demo. In the sub-folders **_1-demos-setup_** and **_2-demos-execution_**, you'll find instructions to setup and run that demo.

#### 1. Load testing and auto-scaling demo - available at start of recording
In this demo we configure a local load testing tool (in our case JMeter) to hit an Openshift based Spring Boob REST API. This Openshift deployment has been condigured to auto-scale. The demo involves firsing the load, waiting a couple of minutes to see it scale up and another couple of mintes to see it scale down.

![Load test demo](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%201%20-%20Load%20Test.png)
  
_________________________________________________________________________________________________________  

#### 2. CICD demo - starts at minute-second 2-04
Here we use the Openshift Jenkins plugin (where Jenkins runs inside Openshift). We use a simple pipleline where there are automated steps to push the application from development to test then a manual approval to push to production.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  

#### 3. S2I - starts at minute-second 9-04
Here we use Openshift's [Source To Image (S2I) process](https://docs.openshift.com/container-platform/3.10/architecture/core_concepts/builds_and_image_streams.html#source-build) to overlay our Java Spring Boot API code onto an OpenJDK base image.
  
 ![S2I](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%203%20-%20S2I.png)
  
_________________________________________________________________________________________________________  

#### 4. Routes and Services Applied (API Gateway) - starts at minute-second 12-45
Here we demonstrate 
- [Openshift Routes](https://docs.openshift.com/container-platform/3.10/architecture/networking/routes.html)
- [Openshift Services](https://docs.openshift.com/container-platform/3.10/architecture/core_concepts/pods_and_services.html)
- and the ease at which you can protect and get analytics on your APIs with [3scale API Management](https://www.redhat.com/en/technologies/jboss-middleware/3scalehttps://docs.openshift.com/container-platform/3.10/architecture/networking/routes.html)
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  

#### 5. Blue Green Deployments - starts at minute-second 17-15
Here we.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  

#### 6. AB Testing - starts at minute-second 19-23
Here we.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  

#### 7. Istio - starts at minute-second 22-15
Here we.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  

#### 8. Fabric8 Maven Plugin - starts at minute-second 32-45
Here we.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)
  
_________________________________________________________________________________________________________  



## Short demonstrations


[1] Many of the examples have been taken from the excellent Devops with Openshift book available for free download at https://www.openshift.com/devops-with-openshift/
Istio examples taken from the tutorial: https://github.com/RedHat-Middleware-Workshops/modernize-apps-katacoda/blob/master/docs/cdk-docs/md/06-resilient-apps.md
