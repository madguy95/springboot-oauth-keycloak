## Spring Security OAuth Keycloak

### Relevant information:

1. `authorization-server` is a Keycloak Authorization Server wrapped as a Spring Boot application
2. There is one OAuth Client registered in the Authorization Server:
   1. Client Id: newClient
   2. Client secret: newClientSecret
   3. Redirect Uri: http://localhost:8089/
2. `oauth-ui-authorization-code-angular` - A simple Angular App
3. `oauth-resource-server` is a Spring Boot based RESTFul API, acting as a backend Application
