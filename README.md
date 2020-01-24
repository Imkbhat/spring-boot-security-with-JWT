# spring-boot-security-with-JWT

Reference : https://medium.com/@sopheamak/springboot-security-with-jwt-fca1446790ba


REST APIs Test
------------------------

    Register new user

curl -X POST \
  http://localhost:8080/register \
  -H 'content-type: application/json' \
  -d '{"username":"test","password":"password"}'

    Login API to exchange token

curl -X POST \
  http://localhost:8080/auth/token \
  -H 'content-type: application/json' \
  -d '{ "username":"test", "password":"password"}'
  
  
  response back {
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0IiwiUk9MRVMiOlsiUk9MRV9VU0VSIl0sImV4cCI6MTU3ODE3ODI5NSwiaWF0IjoxNTc4MTYwMjk1fQ.gDMuDfp1_1kv729HrOWCskTm4rNCm7SSoniqDHZuRD5H1uUtFzbiktN9NVaTNaTvp14UqGavQygKhO3pTFOQJg"
}


curl -X GET http://localhost:8080/secure -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0IiwiUk9MRVMiOlsiUk9MRV9VU0VSIl0sImV4cCI....'


