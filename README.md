
```
docker volume create --name esdata
docker run -d --rm -p 9200:9200 --name elasticsearch_7_10_2 -v esdata:/usr/share/elasticsearch/data -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.10.2
```
