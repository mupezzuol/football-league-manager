FROM gcr.io/distroless/base
ARG APP_FILE
EXPOSE 8080
COPY target/${APP_FILE} app
ENTRYPOINT ["/football-league-manager"]

# docker build --build-arg APP_FILE=target/football-league-manager -t mupezzuol/football-league-manager .