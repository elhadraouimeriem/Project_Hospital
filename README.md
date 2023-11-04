<h1 style="text-align: center;">Rapport de Projet Hospital Project</h1>

<h2>Structure du Projet</h2>
<p>Le projet "Hospital Project" est organisé en plusieurs packages et comprend les éléments suivants :</p>
<ol>
  <li><strong>ma.meriem.hospitalProject.entities :</strong>
    Ce package contient les classes qui représentent les entités du projet.
    <ul>
      <li><strong>Patient :</strong> Cette classe représente les patients de l'hôpital. Elle comprend des informations telles que le nom du patient, sa date de naissance, son état de maladie et une relation vers les rendez-vous associés.</li>
      <li><strong>Medecin :</strong> Cette classe représente les médecins travaillant à l'hôpital. Elle inclut des informations telles que le nom du médecin, son adresse e-mail, sa spécialité (cardiologue ou dentiste) et une relation vers les rendez-vous associés.</li>
      <li><strong>RendezVous :</strong> Cette classe représente les rendez-vous entre les patients et les médecins. Elle comprend des informations sur la date du rendez-vous, son statut (en attente, annulé ou effectué), ainsi que des relations vers le patient, le médecin et la consultation associée.</li>
      <li><strong>Consultation :</strong> La classe Consultation est liée à un rendez-vous et contient des informations sur la date de la consultation et un rapport médical.</li>
    </ul>
  </li>

  <li><strong>ma.meriem.hospitalProject.repositories :</strong>
    Ce package contient les interfaces de gestion des données pour chaque entité, utilisant Spring Data JPA pour effectuer les opérations de base.
  </li>

  <li><strong>ma.meriem.hospitalProject.service :</strong> Ce package contient l'interface IHospitalService et son implémentation HospitalServiceImpl. L'interface définit des méthodes pour sauvegarder des patients, des médecins, des rendez-vous, et des consultations. L'implémentation utilise les repositories pour gérer les entités et crée des relations entre elles.</li>

  <li><strong>ma.meriem.hospitalProject.web :</strong> Ce package contient le contrôleur PatientRestController, qui expose une API REST pour récupérer la liste des patients.</li>
</ol>

<h2>Utilisation des Annotations</h2>
<p>Les annotations sont largement utilisées dans le projet pour configurer les entités, les repositories, et les contrôleurs REST. Voici un résumé des annotations clés et de leur utilité :</p>
<ol>
  <li><strong>Annotations liées aux entités :</strong>
    <ul>
      <li><strong>@Entity :</strong> Marque les classes comme des entités persistantes, mappées sur des tables de base de données.</li>
      <li><strong>@Id :</strong> Définit un champ comme la clé primaire de l'entité.</li>
      <li><strong>@GeneratedValue(strategy = GenerationType.IDENTITY) :</strong> Définit la stratégie de génération des valeurs de la clé primaire, indiquant que la base de données génère automatiquement les valeurs.</li>
      <li><strong>@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) :</strong> Contrôle la sérialisation JSON des entités en excluant certains champs de la réponse JSON.</li>
      <li><strong>@Enumerated(EnumType.STRING) :</strong> Utilisée pour stocker les valeurs d'une énumération sous forme de chaînes de caractères dans la base de données, ce qui facilite la lisibilité des données.</li>
    </ul>
  </li>

  <li><strong>Annotations liées aux repositories :</strong>
    <ul>
      <li><strong>@Repository :</strong> Indique que la classe est un composant de persistance Spring, activant la création automatique d'une implémentation de l'interface par Spring Data JPA.</li>
      <li><strong>JpaRepository :</strong> L'interface fournit des méthodes de base pour effectuer des opérations de CRUD sur l'entité correspondante.</li>
    </ul>
  </li>

  <li><strong>Annotations liées aux contrôleurs REST :</strong>
    <ul>
      <li><strong>@RestController :</strong> Marque les classes comme des contrôleurs REST, permettant d'exposer des points d'API HTTP.</li>
      <li><strong>@GetMapping :</strong> Définit les méthodes comme des gestionnaires de requêtes HTTP GET pour des chemins d'URL spécifiques.</li>
      <li><strong>@Autowired :</strong> Utilisée pour injecter automatiquement les dépendances, permettant d'accéder aux ressources nécessaires, comme les repositories, dans les contrôleurs.</li>
    </ul>
  </li>

  <li><strong>Annotation @Bean pour la Configuration des Beans :</strong>
    <ul>
      <li><strong>@Bean :</strong> Utilisée pour créer un bean personnalisé de type CommandLineRunner, gérant des dépendances, personnalisant le comportement du démarrage de l'application, centralisant la configuration, et exécutant des tâches spécifiques au lancement de l'application.</li>
    </ul>
  </li>
</ol>
