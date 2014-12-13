openshift-java-mysql
====================

This is a simple app that runs on Openshift with MySQL. The MySQL cartridge must be added.

* The main page can be found at /openshift-java-mysql
* The api endpoints can be found at /openshift-java-mysql/api/...


This app requires a database like the following:

```
CREATE TABLE test (
id SERIAL,
value TEXT,

PRIMARY KEY (id)
);
```