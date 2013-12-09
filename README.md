computer-database-postgres
==========================

Play2 Framework java sample migrated to work on PostgreSQL DB.

This is a classic CRUD application, backed by a JDBC database. It demonstrates:

- Accessing a JDBC database, using Ebean.
- Achieving, table pagination and CRUD forms.
- Integrating with a CSS framework (Twitter Bootstrap ).

Twitter Bootstrap requires a different form layout to the default one that the Play form helper generates, so this application also provides an example of integrating a custom form input constructor.

This application although was originally a sample Play2 Framework sample java app, has been modified so that it can be deployed on local as well as on an OpenShift DIY gear.
Basic commands for building up the OpenShift app for this project :

rhc app create -a computerdb -t diy-0.1

rhc add-cartridge -a computerdb -c postgresql-9.2


Thats it, the empty app is ready to be deployed, just use the openshift_deploy script in the root directory to deploy it to your OpenShift account.

P.S. : The internal application name has been changed to "computerdb" to pass the OpenShift application name validations.
