FROM node:18-alpine
WORKDIR /tmp/react

COPY . .

RUN npm i

RUN npm run build
RUN mkdir -p /var/www/html
RUN mv dist/* /var/www/html

RUN npm install

WORKDIR /

RUN rm -rf /tmp/react