FROM nginx:alpine
RUN apk update
RUN  apk add --no-cache bash
COPY ./default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/build  /etc/nginx/html/
COPY ./wait-for-it.sh .
RUN chmod 777 ./wait-for-it.sh
ENTRYPOINT [ "./wait-for-it.sh","--timeout=600","--host=app","--port=8080","-s","--","nginx","-g","daemon off;" ]