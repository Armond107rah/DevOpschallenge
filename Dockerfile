#Dockerfile
FROM python:latest

WORKDIR /app

COPY print.py .

CMD ["python", "print.py"]