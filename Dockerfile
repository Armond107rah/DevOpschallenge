#Dockerfile
FROM python:latest

WORKDIR /

COPY . /

CMD ["python", "print.py"]