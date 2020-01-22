 To test if the config server is working go to:
- http://localhost:8888/{config.properties name}/production
- http://localhost:8888/{config.properties name}/client
- http://localhost:8888/{config.properties name}/development

To force the client's refresh command: 
$ curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
