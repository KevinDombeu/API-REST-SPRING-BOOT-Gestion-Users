# API-REST-SPRING-BOOT-Gestion-Users
Il s'agit d'une API REST développer avec Spring Boot (Java). 
L’API permet de gérer une ressource Utilisateur, permettant la création, la récupération, la mise à jour et
la suppression (CRUD).
 
Cette application web a été conçue pour prendre en main Spring Boot dans le cadre d'une formation DevOPs. 
Ce fichier README explique comment configurer et exécuter l'application, ainsi que ses fonctionnalités et son utilisation.

Compétences acquises : Développement Backend | API REST | Gestion des Données | Framework Backend | Structurer leur code en respectant les bonnes pratiques backend | Implémenter les opérations CRUD


## Fonctionnalités
Un controlleur qui récupère les interactions des utilisateurs, les envois vers un service et retourne les résultats fournis par le service.
Un service qui interagit avec une base de données H2 Database en fonction des requetes des utilisateurs. 
Un repository qui contient toutes les fonctions d'interactions avec la table "Users" de la base de données H2 Database.
Un model qui décrit l'objet "User" qui sera manipuler proposant les Routes API CRUD suivantes :
	* GET /users → Récupérer tous les utilisateurs
	* GET /users/{id} → Récupérer un utilisateur par ID
	* POST /users → Ajouter un nouvel utilisateur
	* PUT /users/{id} → Mettre à jour un utilisateur
	* DELETE /users/{id} → Supprimer un utilisateur

## Prérequis
Avant d'exécuter l'application, rassurez-vous d'avoir installer les éléments suivants :
- Installer JDK 17+
- Maven

## Installation
Cloner ce repository sur votre machine locale :
git clone https://github.com/KevinDombeu/API-REST-SPRING-BOOT-Gestion-Users.git

## Démarrage du projet
- à partir de la racine du projet
mvn spring-boot:run 

## Tests de l'API
# Test avec Postman ou Insomnia
Base URL : http://localhost:3325/users
Methode : POST 
Content-Type : json
Body : {"nom": "Alice", "email": "alice@example.com", "age": 25}
# Test avec curl
curl -X POST http://localhost:3325/users \
	-H "Content-Type: application/json" \
	-d '{"nom": "Alice", "email": "alice@example.com", "age": 25}'