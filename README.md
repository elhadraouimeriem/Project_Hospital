<h1>Rapport de Projet Hospital Project</h1>
<h2>Structure du Projet</h2>
<p>Le projet est organisé en plusieurs packages et comprend les éléments suivants :</p>
<ol>
  <li>ma.meriem.hospitalProject.entities:
    Ce package contient les classes qui représentent les entités du projet.
    <ul>
      <li>Patient:Cette classe représente les patients de l'hôpital. 
Elle comprend des informations telles que le nom du patient, sa date de naissance,
son état de maladie et une relation vers les rendez-vous associés.</li>
      <li>Medecin:eprésente les médecins travaillant à l'hôpital. Elle inclut des informations telles que le nom du médecin, son adresse e-mail, sa spécialité 
(cardiologue ou dentiste) et une relation vers les rendez-vous associés.</li>
    <li>RendezVous:Cette classe représente les rendez-vous entre les patients et les médecins. Elle comprend des informations sur la date du rendez-vous, son statut (en attente, annulé ou effectué), ainsi que des 
relations vers le patient, le médecin et la consultation associée.</li>
<li>Consultation:La classe Consultation est liée à un rendez-vous et contient des informations sur
la date de la consultation et un rapport médical.</li>
    </ul>
  </li>

<li>ma.meriem.hospitalProject.repositories:
    Ce package contient les interfaces de gestion des données pour chaque entité, utilisant Spring Data JPA pour effectuer les opérations de base.
  </li>
<li>ma.meriem.hospitalProject.service: Ce package contient l'interface IHospitalService et son implémentation HospitalServiceImpl. L'interface définit des méthodes pour sauvegarder des patients, des médecins, des rendez-vous, et des consultations. L'implémentation utilise les repositories pour 
gérer les entités et crée des relations entre elles.</li>
  </li>
<li>ma.meriem.hospitalProject.web: Ce package contient le contrôleur PatientRestController,
qui expose une API REST pour récupérer la liste des patients.</li>
  </li>
</ol>
<h2>Utilisation des Annotations</h2>
<ol>
<li> Annotations liées aux entités
<ul>@Entity : Cette annotation est utilisée pour marquer les classes comme des entités persistantes, ce qui signifie qu'elles sont mappées sur des tables de base de données. Les entités sont les éléments de base de la base de données, comme les patients, les médecins, les rendez-vous et les consultations.</ul>
<ul>@Id : L'annotation @Id est utilisée pour définir un champ comme la clé primaire de l'entité. La clé primaire est un attribut unique qui permet d'identifier de manière unique chaque enregistrement dans la table de la base de données.</ul>
<ul>@GeneratedValue(strategy = GenerationType.IDENTITY) : Cette annotation définit la stratégie de génération des valeurs de la clé primaire, indiquant que la base de données génère automatiquement les valeurs. Cela simplifie la création de nouvelles entrées dans la base de données.</ul>
<ul>@GeneratedValue(strategy = GenerationType.IDENTITY) : Cette annotation définit la stratégie de génération des valeurs de la clé primaire, indiquant que la base de données génère automatiquement les valeurs. Cela simplifie la création de nouvelles entrées dans la base de données.</ul>
<ul>@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) : Cette annotation est utilisée pour contrôler la sérialisation JSON des entités. Dans ce projet, elle est principalement utilisée pour exclure certains champs de la sérialisation, ce qui signifie que ces champs ne seront pas inclus dans la réponse JSON. Par exemple, les champs marqués avec cette annotation ne seront pas renvoyés dans les réponses JSON des contrôleurs REST, ce qui est utile pour des champs sensibles ou des relations.</ul>
<ul>@Enumerated(EnumType.STRING) dans Java Persistence API (JPA) est utilisée pour indiquer que les valeurs d'une énumération doivent être stockées sous forme de chaînes de caractères dans une base de données. Cette annotation permet de conserver la lisibilité des données en enregistrant les noms des constantes de l'énumération plutôt que leurs valeurs numériques. Par exemple, une énumération "StatusRDV" avec des constantes comme "PENDING," "CANCELED," et "DONE" sera stockée en base de données sous forme de chaînes telles que "PENDING," "CANCELED," et "DONE," ce qui facilite la compréhension des données persistantes, même si cela peut entraîner une légère augmentation de la taille de la base de données.</ul>
</li>
</ol>