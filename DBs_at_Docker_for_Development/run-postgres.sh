docker run -d -p 5432:5432 --name postgres --network loanApp -e POSTGRES_DB=db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres postgres:13.1-alpine
