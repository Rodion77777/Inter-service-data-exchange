module secondmodule {
    exports microservice.module2.entity;
    requires firstmodule;
    requires static lombok;
}