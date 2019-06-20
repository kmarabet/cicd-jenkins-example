# CICD Using Jenkins Pipeline and IBM Clouds / Cloud Foundry (ex. Bluemix)

- `Jenkinsfile` controls the Jenkins Pipeline. More stages can be added into this file
- `/hello` REST endpoint returns a message
- Command to deploy into IBM CF / BLUEMIX
    
        cf login -a https://api.ng.bluemix.net -u <user_name> -p <password>
        cf push -f <path_to_manifest_yml>