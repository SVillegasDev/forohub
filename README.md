# Proyecto de API REST con Spring Boot

**Descripción:**
Este proyecto es una API RESTful construida con **Spring Boot** para la gestión de tópicos. La API implementa **autenticación y autorización** mediante **JWT** (JSON Web Token) y permite realizar diversas operaciones **CRUD** sobre los tópicos. 

**Tecnologías utilizadas:**
- **Spring Boot**: Framework para desarrollar aplicaciones Java basadas en Spring.
- **Spring Security**: Para la gestión de seguridad, incluyendo la autenticación y autorización mediante JWT.
- **JWT (JSON Web Token)**: Para autenticar y autorizar a los usuarios.
- **FlywayDB**: Para gestionar las migraciones de la base de datos.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **MySQL**: Sistema de gestión de base de datos.
- **Lombok**: Para reducir la cantidad de código repetitivo (como getters, setters, etc.).

**Funcionalidades principales:**

1. **Generación de Tokens JWT**  
   La API utiliza tokens JWT para autenticar y autorizar a los usuarios. El token se genera con una clave secreta y se asocia con un usuario. El token tiene una expiración configurada y debe ser incluido en las solicitudes HTTP como `Authorization: Bearer <token>` para restringir el acceso a recursos protegidos.

2. **Autenticación y Autorización**  
   El controlador `AutenticacionController` gestiona el proceso de autenticación. Cuando un usuario se autentica correctamente, se genera un token JWT que puede ser utilizado para acceder a recursos protegidos.  
   El token JWT debe ser enviado en la cabecera de las solicitudes:  
   `Authorization: Bearer <token>`.  
   El filtro `SecurityFilter` intercepta las solicitudes y valida el token, configurando el contexto de seguridad para los usuarios autenticados.

3. **Manejo de Errores**  
   Se gestionan errores comunes como la falta de datos o la validación incorrecta de entradas mediante el uso de `@RestControllerAdvice`.  
   Si una entidad no se encuentra o la validación de los datos falla, la API responde con los códigos HTTP correspondientes y detalles de los errores.

4. **Operaciones CRUD para Tópicos**  
   La API permite realizar operaciones sobre los tópicos:

   - `POST /topicos`: Registrar un nuevo tópico. 
   - `GET /topicos`: Obtener una lista paginada de tópicos activos.
   - `GET /topicos/{id}`: Obtener los detalles de un tópico específico.
   - `PUT /topicos`: Actualizar un tópico existente.
   - `DELETE /topicos/{id}`: Eliminar un tópico (lo desactiva en lugar de borrarlo físicamente).

5. **Base de Datos**  
   El proyecto utiliza **FlywayDB** para gestionar las migraciones de base de datos, lo que facilita la evolución de la estructura de datos de forma controlada y versionada.

