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
    </ul>
  </li>
<li>La classe Consultation est liée à un rendez-vous et contient des
informations sur la date de la consultation et un rapport médical.</li>
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