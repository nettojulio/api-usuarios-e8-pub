kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/secret-usuarios.yaml --namespace=grupo-08-prod
kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/configmap-usuarios.yaml --namespace=grupo-08-prod
kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/loadbalancer-usuarios.yaml --namespace=grupo-08-prod
kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/clusterip-usuarios.yaml --namespace=grupo-08-prod
kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/deployment-usuarios.yaml --namespace=grupo-08-prod
kubectl delete -f /home/ubuntu/grupo08/prod-api-usuarios-e8-deploy/hpa-usuarios.yaml --namespace=grupo-08-prod