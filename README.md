# spring-cloud-eureka-service

Pour faire fonctionner le projet sous eclipse, il faut le plugin sts sous eclipse (ou avoir spring-sts) et dans les configuration de lancement, définir 2 instances avec deux paramètres spécifiques :

server.port = 8081/8082
service.instance.name = instance 1/instance 2

Ainsi, une fois le service discovery lancé, on peut lancer les deux instances du service qui vont s'enregistrer auprès du service-discovery (http status 204)