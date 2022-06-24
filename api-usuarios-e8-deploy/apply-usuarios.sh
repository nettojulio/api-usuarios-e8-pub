kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/secret-usuarios.yaml --namespace=grupo-08-dev
kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/configmap-usuarios.yaml --namespace=grupo-08-dev
kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/loadbalancer-usuarios.yaml --namespace=grupo-08-dev
kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/clusterip-usuarios.yaml --namespace=grupo-08-dev
kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/deployment-usuarios.yaml --namespace=grupo-08-dev
kubectl apply -f /home/ubuntu/grupo08/api-usuarios-e8-deploy/hpa-usuarios.yaml --namespace=grupo-08-dev