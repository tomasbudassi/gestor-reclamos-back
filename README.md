# API Backend - Gestion de Reclamos

## Endpoints Reclamos

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
/reclamos/empleado/{id}
```

### POST - Crear Reclamo
```
/reclamos
```

### UPDATE - Actualizar Reclamo
```
/reclamos/{id}
```

### DELETE - Eliminar Reclamo
```
/reclamos/{id}
```

## Endpoints Empleado

### GET - Empleado by Id
```
/empleados/{id}
```

### GET - Empleado (Todos)
```
/empleados
```

### POST - Login Empleado
```
/empleados/login
```

## Endpoints Tipo de Reclamo

### GET - Tipos de Reclamo (Todos)
```
/tipos_reclamo
```

### GET - Tipos de Reclamo by Id
```
/tipos_reclamo/{id}
```
