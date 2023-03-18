# spring-cloud-discovery

Pre-requisites:
--------
    - Install Git
    - Install Maven
    - Install Docker
    - EKS Cluster
    
Clone code from github:
-------
    git clone https://github.com/VamsiTechTuts/spring-cloud-kubernetes.git
    cd spring-cloud-kubernetes/spring-cloud-discovery
    
Build Maven Artifact:
-------
    mvn clean install
 
Build Docker image for Springboot Application
--------------
    docker build -t vamsitechtuts/spring-cloud-discovery .
  
Docker login
-------------
    docker login
    
Push docker image to dockerhub
-----------
    docker push vamsitechtuts/spring-cloud-discovery
    
Deploy Spring Application:
--------
    kubectl apply -f deployment.yaml
    
Check Deployments, Pods and Services:
-------

    kubectl get deploy
    kubectl get pods
    kubectl get svc
    
Now Goto Loadbalancer and check whether service comes Inservice or not, If it comes Inservice copy DNS Name of Loadbalancer and Give in WebUI
    
    http://a695c51e175054f9d9c1a966dce01e33-292728232.us-west-2.elb.amazonaws.com:8081/api/sample

![1](https://user-images.githubusercontent.com/63221837/82123510-7cfd3600-97b7-11ea-8066-9c2a8f2ad83a.png)
Now we can cleanup by using below commands:
--------
    kubectl delete deploy spring-cloud-discovery
    kubectl delete svc spring-cloud-discovery
