Spring Details:

Types of IOC (Inversion Of Control) Container:
1) Bean Factory
2) Application Context

Scope of beans: 
1) Singleton - This scopes the bean definition to a single instance per Spring IoC container (default).
2) Prototype - This scopes a single bean definition to have any number of object instances.
3) Request - This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
4) Session - This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
5) Global Session - This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.