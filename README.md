# HelloDocker
Hello Docker

#### Docker build command
* docker build -f DOCKER_FILE -t DOCKER_IMAGE_NAME .

```sh
$ docker build -f Dockerfile -t hello-docker .
```

#### Command to run the docker image
* docker run --name NAME -p EXPOSED_PORT DOCKER_IMAGE_NAME

```sh
$ docker run --hello-docker -p 8080:8080 hello-docker
```

#### Command to list all local images

```sh
$ docker images
```

#### Command to list all virtual docker machines

```sh
$ docker-machine ls
```

#### Command to list all the running docker containers

```sh
$ docker container ls
```

#### Command to stop the running container by id
* docker container stop CONTAINER_ID

```sh
$ docker container stop a67brj377378db
```