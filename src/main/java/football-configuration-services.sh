#!/bin/bash
docker build -f Docker -t football-configuration-services .
docker run -p 8089:8089 football-configuration-services