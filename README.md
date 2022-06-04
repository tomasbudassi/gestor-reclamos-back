# API Backend - Gestion de Reclamos

## Endpoints

### GET - Reclamos (Todos)
```
/reclamos/todos?page=0&size=10
```

### GET - Reclamos (Todos menos reclamos cerrados)
```
/reclamos?page=0&size=10
```

### GET - Reclamo by Id
```
/reclamos/{id}
```

### GET - Reclamos by Status
```
/reclamos/estado/nuevo?page=0&size=10
```

### GET - Reclamos by Empleado
```
/reclamos/empleado/1
```

### POST - Crear Reclamo
```
/reclamos
```

### UPDATE - Actualizar Reclamo
```
/reclamos/{id}
```

