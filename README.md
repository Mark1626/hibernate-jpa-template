# Hibernate JPA Template 

This repo is to play around with Hibernate + JPA API

## Initial Setup

- `create database hibernate`
- Change username and password in `persistence.xml`

### Usage

> Assumes there is a postgresql running

`./gradlew run`

### Adding new entities

- Add a mapping for the entity class in `persistence.xml`

```xml
<persistence-unit>
  <class>com.mark.Book</class>
</persistence-unit>
```

