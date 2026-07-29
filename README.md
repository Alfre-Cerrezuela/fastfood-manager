"Proyecto inspirado en procesos reales de gestión y capacitación de equipos en cadenas de comida rápida."
#dependencias:

Spring Web
Es la dependencia que convierte tu proyecto en una API REST, incluye:Servidor Tomcat embebido
Spring MVC
DispatcherServlet
Conversión automática a JSON
Manejo de peticiones HTTP

Spring Data JPA
Sin ella deberías escribir SQL para absolutamente todo.
Spring usa Hibernate
usuarioRepository.save(usuario)
Hibernate genera:
INSERT INTO usuarios ...;
tambien permite las relaciones entre clases;

Validation
Sirve para validar datos antes de guardarlos.
evita que lleguen datos inválidos al Service.

Spring Security
Es el encargado de toda la seguridad.
sirve para:
Login
Logout
Roles
Permisos
JWT
Filtros
BCrypt

Lombok
Evita escribir muchísimo código repetitivo.

DevTools
Sirve solamente para desarrollar.
Cada vez que modificás una clase
CTRL+S
Spring reinicia solo.
No hace falta cerrar la aplicación.

H2 Database
Es una base de datos en memoria.
tiene consola web.
localhost:8080/h2-console

PostgreSQL Driver
No instala PostgreSQL.
Simplemente permite que Java hable con PostgreSQL.

Configuration Processor
Sirve para el autocompletado.
Por ejemplo
app.jwt.secret=
Cuando escribís
app.
IntelliJ ya conoce tus propiedades.
No cambia el funcionamiento del programa.
Solo ayuda al desarrollador.

JWT
No viene con Spring.
Es una librería aparte.
Sirve para generar tokens.

Swagger
Genera documentación automática.
Entrás a
localhost:8080/swagger-ui
Y aparece
POST /login
GET /usuarios
DELETE /usuarios
PUT /tareas
Con botones para probar todo.
Es una maravilla para desarrollar.