# Openshift Developer Focussed Demos

## Introduction
We have created several simple developer focussed Openshift Demos and recorded them [1]. There are 2 versions: 
- A long one. This is split into 2 recordings available on Dropbox:
  - [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
  - [Part 2](https://www.dropbox.com/s/qfoikb4tag8yflu/Openshift-Demos-Tom-Corcoran-2.mov)
- A short one available on [YouTube](https://www.youtube.com/watch?v=eAG5o6Alx3k)


With each, we provide introductions on the README as well as instructions to set them up and demo them yourself.

## Main demonstrations
With each demonstration, we provide you with a brief description as well as the starting time in the video for that demo. Clone this repo. In the sub-folder **[1-demos-setup-and-execution](https://github.com/tnscorcoran/openshift-demos/tree/master/1-demos-setup-and-execution)**, you'll find instructions to setup and run that demo. [2]

#### 1. Load testing and auto-scaling demo - available at start of [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
In this demo we configure a local load testing tool (in our case JMeter) to hit an Openshift based Spring Boob REST API. This Openshift deployment has been condigured to auto-scale. The demo involves firsing the load, waiting a couple of minutes to see it scale up and another couple of mintes to see it scale down.

![Load test demo](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%201%20-%20Load%20Test.png)
  
For instructions on how to set this up, see [Load testing and auto-scaling demo.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/1.%20Load%20testing%20and%20auto-scaling%20demo.md)


_________________________________________________________________________________________________________  

#### 2. CICD demo - starts at minute-second 2-04 in [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
Here we use the Openshift Jenkins plugin (where Jenkins runs inside Openshift). We use a simple pipleline where there are automated steps to push the application from development to test then a manual approval to push to production.
  
 ![CICD](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%202%20-%20CICD.png)


For instructions on how to set this up, see [CICD demo.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/2.%20CICD%20demo.md)
  
_________________________________________________________________________________________________________  

#### 3. S2I - starts at minute-second 9-04 in [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
Here we use Openshift's [Source To Image (S2I) process](https://docs.openshift.com/container-platform/3.10/architecture/core_concepts/builds_and_image_streams.html#source-build) to overlay our Java Spring Boot API code onto an OpenJDK base image.
  
 ![S2I](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%203%20-%20S2I.png)

For instructions on how to set this up, see [Source To Image (S2I) Springboot API Demo.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/3.%20Source%20To%20Image%20(S2I)%20Springboot%20API%20Demo.md)
  

  
_________________________________________________________________________________________________________  

#### 4. Routes and Services Applied (API Gateway) - starts at minute-second 12-45 in [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
Here we demonstrate 
- [Openshift Routes](https://docs.openshift.com/container-platform/3.10/architecture/networking/routes.html)
- [Openshift Services](https://docs.openshift.com/container-platform/3.10/architecture/core_concepts/pods_and_services.html)
- and the ease at which you can protect and get analytics on your APIs with [3scale API Management](https://www.redhat.com/en/technologies/jboss-middleware/3scalehttps://docs.openshift.com/container-platform/3.10/architecture/networking/routes.html)
  
 ![applied](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%204%20-%20Routes%20and%20Services%20Applied%20-%20API%20Gateway.png)

For instructions on how to set this up, see [Routes and Services Applied (API Gateway).md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/4.%20Routes%20and%20Services%20Applied%20(API%20Gateway).md)
  

  
_________________________________________________________________________________________________________  

#### 5. Blue Green Deployments - starts at minute-second 17-15 in [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
Here we use Openshift routing capabilities to switch production traffic between and blue and a green deployment .
  
 ![blue Green - blue](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%205%20-%20Blue%20Green%20(Blue).png)
  
  
 ![blue Green - green](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%206%20-%20Blue%20Green%20(Green).png)
 
For instructions on how to set this up, see [Blue Green Deployments.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/5.%20Blue%20Green%20Deployments.md)
  

  
_________________________________________________________________________________________________________  

#### 6. AB Testing - starts at minute-second 19-23 in [Part 1](https://www.dropbox.com/s/5w8xft5qczb8bgy/Openshift-Demos-Tom-Corcoran-1.mov)
Here we use more fine grained capabilities or Openshift's routing to split a percentage of traffic to a new deployment. This allows us make and test a hypothesis. If successful we can roll out to all traffic.
  
 ![ab-testing](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%207%20-%20AB%20Testing.png)
  
For instructions on how to set this up, see [AB Testing.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/6.%20AB%20Testing.md)
  

  
_________________________________________________________________________________________________________  

#### 7. Istio - starts at minute-second 2-15 in [Part 2](https://www.dropbox.com/s/qfoikb4tag8yflu/Openshift-Demos-Tom-Corcoran-2.mov)
Here we use the Microservice traffic management and visualisation standard [Istio](https://istio.io/). We use [Prometheus](https://prometheus.io/), [Jaeger](https://www.jaegertracing.io/docs/) and [Grafana](https://grafana.com/) to visualise the traffic. We then control traffic using Istio - demonstrating Canary and AB deployments.

* This shows the components and interaction of the Istio Control and Data Planes *  
![istio-1](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%208%20-%20Istio%20Overview.png)

* This shows the sample application - a web pabe made up of Microservices which we will control with Istio *
![istio-2](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%209%20-%20Istio%20Demo%201.png)

* This gives a visual depiction of the Microservices in the sample application *
![istio-3](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%2010%20-%20Istio%20Demo%202.png)
  
For instructions on how to set this up, see [Istio.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/7.%20Istio.md)
  

  
_________________________________________________________________________________________________________  

#### 8. Fabric8 Maven Plugin - starts at minute-second 12-45 in [Part 2](https://www.dropbox.com/s/qfoikb4tag8yflu/Openshift-Demos-Tom-Corcoran-2.mov)
We demonstrate a very cool Maven plugin - fabric8. Allows developers rapidly and easily deploy their apps on Openshift.
  
 ![Fabric8](https://github.com/tnscorcoran/openshift-demos/blob/master/images/Openshift%20Demo%20-%2011%20-%20Fabric8%20Maven%20Plugin.png)
  
For instructions on how to set this up, see [Fabric8 Maven Plugin.md](https://github.com/tnscorcoran/openshift-demos/blob/master/1-demos-setup-and-execution/8.%20Fabric8%20Maven%20Plugin.md)
  

  
_________________________________________________________________________________________________________  



## Short demonstrations

We've also created a short demo on 2 of Openshift's Agility promoting capabilities for developers: Source to Image and CICD integration. For overview and instructions see sections 2 and 3 above. The video is available here: https://www.youtube.com/watch?v=eAG5o6Alx3k&t=17s

_________________________________________________________________________________________________________  
_________________________________________________________________________________________________________  


[1] Many of the examples have been taken from the excellent Devops with Openshift book available for free download at https://www.openshift.com/devops-with-openshift/
Istio examples taken from the tutorial: https://github.com/RedHat-Middleware-Workshops/modernize-apps-katacoda/blob/master/docs/cdk-docs/md/06-resilient-apps.md


[2] Phase 2 will be to automate the creation of these demos using Ansible


