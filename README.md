Kp-adm-backend

- how to test query (ref : https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)
: 1. access http://localhost:8080/graphiql?path=/graphql
: 2. test below line

````
query bookDetails {
  bookById(id: "book-1") {
    id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}
````
