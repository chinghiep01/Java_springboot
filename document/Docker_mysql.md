# Docker and MySql

## What is Docker 
Docker is an open source containerization platform which allow developer to package applications into containers (include source code with the operating system (OS) libraries and dependencies required to run that source code in different environments). Container can create without Docker , but Docker make it easier to build , deploy and manage container. 

## Advantage of containers : 

+ Lighter weight                 : Container only had tue OS processor and depedencies necessary to execute the code .
+ Greater resource efficency     : With containers , user can run several times with many copies of an application .
+ Improve developer productivity : Compare with VM (virtual machine), containers are faster and esier to dploy, provision and restart.This makes containers ideal for use in continuous integration and continous delivery (CI/CD) pipelines

## DockerFile 

DockerFile automate the process of Docker image creation. It is a list of command line interface (CLI) instrutions that Docker Engine will run in order to assemble the image.  

## Docker Hub 

Docker Hub is the public repsoitory of Docker images .It hold over 100,000 container images sourced from commercial software vendor and open-source projects . 

## Docker image 

Docker images contain executable application source code , tools, libraries and dependencies that the application code needs to run as a container. When you run the Docker image, it becomes one instance (or multiple instances) of the container.

Docker images are made up of layers and each layer corresponds to a version of the image. When a developer makes changes to the image, a new top layer is created, and the new top layer replaces the old top layer as the current version of the image. Previous layers are saved for rollbacks or to be re-used in other projects.

When a container is created from a Docker image,  another new layer called the container layer is created. Changes made to the container such as the addition or deletion of files are saved to the container layer  and exist only while the container is running.  



## Docker container 

Docker containers are the live , running instances of Docker images . Users can interact with them, and administrators can adjust their settings and conditions using docker commands.


## MySQL:
MySQL is the world's most popular open source database

**Advantage:** 
+ MySQL is a Relational Database Management System or RDBMS which means that it stores and presents data in tabular form, organized in rows and columns.

+ MySQL has a unique storage engine architecture which makes it faster, cheaper and more reliable.

+ MySQL is very flexible as it supports a large number of embedded applications.


**Disadvantage:**

+ MySQL is not very efficient in handling very large database. 

+ MySQL doesn't have as good a developing and debugging tool as compared to paid databases. 

+ MySQL does not support SQL check constraints.



## Key command: 

**Get the official MySQL Docker image:** 

docker pull mysql 

**Set the Master Password and Run:** 

docker run --name mysql -e MYSQL_USER=user -e MYSQL_ROOT_PASSWORD=password -e MYSQL_PASSWORD=password -e MYSQL_DATABASE=taxdb -p 3306:3306 -d mysql

**Connect Mysql on docker:** 

docker exec -it mysql1 mysql -uroot -p


**Create a User:** 

CREATE USER ‘user’@’%’ IDENTIFIED BY ‘password’; 
GRANT ALL PRIVILEGES ON taxdb.* TO 'user'@'%';



