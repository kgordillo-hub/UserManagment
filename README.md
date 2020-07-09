# UserManagment
 Servicio para agregar usuarios y roles al sistema, se desarrolló usando Spring boot y presenta las operaciones básicas de CRUD mediante los siguientes end point:

 

 ```
 Listar todos los usuarios en el sistema (GET):
 http://host:8080/DatosUsuarios
 ```

 ```
 Consultar un usuario específico (GET):
 http://host:8080/DatosUsuarios/{id}
 ```

 ```
 Agregar un usuario (POST):
 http://host:8080/DatosUsuarios/add
 ```

 ```
 Agregar un usuario (POST):
 http://host:8080/DatosUsuarios/add
 ```

 ```
Actualizar un usuario (POST):
 http://host:8080/DatosUsuarios/update
 ```
 
 El manejo de roles siguien la misma lógica con los siguientes endpoint:
 
 ```
 http://host:8080/roles(GET)
 http://host:8080/roles/{idRol} (GET)
 http://host:8080/roles/add (POST)
 http://host:8080/roles/update (POST)
 ```
 
 ## Build With

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [SpringBoot](https://spring.io/projects/spring-boot) - Para la construcción de la aplicación
* [SpringBoot initializr](https://start.spring.io/) - Para generación del artefacto

## License

This project is licensed under the Apache License 2.0 License
