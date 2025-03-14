module firstmodule {
    exports microservice.module1.entity;
    requires secondmodule;
    requires static lombok;
}