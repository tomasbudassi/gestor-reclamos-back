# API Backend - Gestion de Reclamos

## Endpoints Reclamos

### GET - Reclamos (Todos) - La paginación no es requerida
```
/reclamos/todos?page=0&size=10
```

### GET - Reclamos (Todos menos reclamos cerrados) - La paginación no es requerida
```
/reclamos?page=0&size=10
```

### GET - Reclamo by Id
```
/reclamos/{id}
```

### GET - Reclamos by Status - La paginación no es requerida
```
/reclamos/estado/nuevo?page=0&size=10
```

### GET - Reclamos by Empleado - La paginación no es requerida
```
/reclamos/empleado/{id}?page=0&size=10
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
