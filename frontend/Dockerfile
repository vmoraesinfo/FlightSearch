FROM node:18-alpine
WORKDIR /tmp/react

COPY . .

RUN npm i
RUN npm config set strict-ssl false

RUN npm run build-prod
RUN mkdir -p /var/www/html
RUN mv dist/* /var/www/html

RUN npm install

WORKDIR /

RUN rm -rf /tmp/react