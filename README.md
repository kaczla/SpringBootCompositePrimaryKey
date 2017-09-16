
## SpringBootCompositePrimaryKey

**SpringBootCompositePrimaryKey** is simple *spring boot* project creating REST API with composite primary key in model.

#### Problem

Problem with sharing/mapping generated id in composite primary key while using *spring CRUDRepository* (using *EntityManager* it works fine).

#### Example with using:

##### CrudRepository

**GET**

`GET localhost:8080/api/user?id=1&type=super`

`curl -H 'Accept: application/json' 'localhost:8080/api/user?id=1&type=super'`

**POST** *NOT WORKING*

`POST localhost:8080/api/user`
with [body json](post.json) and header `Content-Type: application/json`

`curl -X POST -H 'Accept: application/json' -H 'Content-Type: application/json' -d @post.json 'localhost:8080/api/user'`

##### EntityManager

**GET**

`GET localhost:8080/api/em/user`

`curl -H 'Accept: application/json' 'localhost:8080/api/em/user?id=1&type=super'`

**POST**

`POST localhost:8080/api/em/user`
with [body json](post.json) and header `Content-Type: application/json`

`curl -X POST -H 'Accept: application/json' -H 'Content-Type: application/json' -d @post.json 'localhost:8080/api/em/user'`
