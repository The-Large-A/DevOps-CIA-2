# DevOps CIA-2 Report
**Name:** Aarav Suriyanarayanan  
**ID:** 23011102004

*(Note: Commit messages are distributed across all tasks)*

---

## Task 1: Initial Repo Setup

```
no changes added to commit (use "git add" and/or "git commit -a")
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git checkout -b feature/course-registration-refactor
Switched to a new branch 'feature/course-registration-refactor'
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ l
pom.xml src/ target/ 
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ ls
pom.xml src/ target/
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git checkout main
M       .gitignore
M       pom.xml
M       src/main/java/com/university/Course.java
M       src/main/java/com/university/RegistrationService.java
M       src/main/java/com/university/Student.java
M       src/test/java/com/university/CourseTest.java
M       src/test/java/com/university/RegistrationServiceTest.java
Switched to branch 'main'
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   .gitignore
        modified:   pom.xml
        modified:   src/main/java/com/university/Course.java
        modified:   src/main/java/com/university/RegistrationService.java
        modified:   src/main/java/com/university/Student.java
        modified:   src/test/java/com/university/CourseTest.java
        modified:   src/test/java/com/university/RegistrationServiceTest.java

no changes added to commit (use "git add" and/or "git commit -a")
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git add .
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git commit -m "Initial Commit"
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC.(none)')
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git config user.name Aarav
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git config user.email aarav23110145@snuchennai.edu.in
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git commit -m "Initial Commit"
[main 77a9c50] Initial Commit
 7 files changed, 412 insertions(+), 412 deletions(-)
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git push -u origin main
fatal: 'origin' does not appear to be a git repository
```

---

## Task 2: File Setup and Writing POM Files

```
git push <name>

snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git checkout -b feature/course-registration-refactor
fatal: A branch named 'feature/course-registration-refactor' already exists.
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git checkout feature/course-registration-refactor
Switched to branch 'feature/course-registration-refactor'
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mkdir -p course-registration-app/src/main/java course-registration-app/src/test/java
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mv src/main/* course-registration-app/src/main/
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mv src/test/* course-registration-app/src/test/
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ nano pom.xml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ nano pom.xml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ nano pom.xml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ nano course-registration-app/pom.xml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn hel[
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Course Registration Parent POM                                     [pom]
[INFO] Course Registration Application                                    [jar]
[INFO] 
[INFO] ----------< com.example:course-registration-parent >----------
[INFO] Building Course Registration Parent POM 1.0-SNAPSHOT               [1/2]
[INFO]   from pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] --- pom ---
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... FAILURE [  0.001 s]
[INFO] Course Registration Application .................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.048 s
[INFO] Finished at: 2026-10-13T09:29:12+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Unknown lifecycle phase "hel[". You must specify a valid lifecycle phase or a goal in the format <plugin-prefix>:<goal> or <plugin-group-id>:<plugin-artifact-id>:<plugin-version>:<goal>. Available lifecycle phases are: pre-clean, clean, post-clean, validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-site, site, post-site, site-deploy. -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/LifecyclePhaseNotFoundException
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Course Registration Parent POM                                     [pom]
[INFO] Course Registration Application                                    [jar]
```

### Maven Clean Test:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn clean test
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Course Registration Parent POM                                     [pom]
[INFO] Course Registration Application                                    [jar]
[INFO] 
[INFO] ----------< com.example:course-registration-parent >----------
[INFO] Building Course Registration Parent POM 1.0-SNAPSHOT               [1/2]
[INFO]   from pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] --- clean:3.2.0:clean (default-clean) @ course-registration-parent ---
...
[INFO] Deleting /home/snucse/Downloads/Student-Starter/target
[INFO] 
[INFO] ----------< com.example:course-registration-app >----------
[INFO] Building Course Registration Application 1.0-SNAPSHOT               [2/2]
[INFO]   from course-registration-app/pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] --- clean:3.2.0:clean (default-clean) @ course-registration-app ---
[INFO] Deleting /home/snucse/Downloads/Student-Starter/course-registration-app/target
...
```

### Clean Test Success and Maven Package:
```
[INFO] --- surefire:3.2.5:test (default-test) @ course-registration-app ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] T E S T S
[INFO] ------------------------------------------------------------------------
[INFO] Running com.university.RegistrationServiceTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s -- in com.university.RegistrationServiceTest
[INFO] Running com.university.CourseTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in com.university.CourseTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... SUCCESS [  0.693 s]
[INFO] Course Registration Application .................... SUCCESS [  5.160 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.896 s
[INFO] Finished at: 2026-10-13T09:29:44+05:30
[INFO] ------------------------------------------------------------------------
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn package
...
[INFO] Building jar: /home/snucse/Downloads/Student-Starter/course-registration-app/target/course-registration-app-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... SUCCESS [  0.001 s]
[INFO] Course Registration Application .................... SUCCESS [  2.000 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.040 s
[INFO] Finished at: 2026-10-13T09:30:08+05:30
[INFO] ------------------------------------------------------------------------
```

### Maven Package Success and Task-2 Commit:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git add .
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git commit -m "Refactored default project repo into multi module Maven structure"
[feature/course-registration-refactor 371db89] Refactored default project repo into multi module Maven structure
 7 files changed, 62 insertions(+), 28 deletions(-)
 create mode 100644 course-registration-app/pom.xml
 rename {src => course-registration-app/src}/main/java/com/university/Course.java (100%)
 rename {src => course-registration-app/src}/main/java/com/university/RegistrationService.java (100%)
 rename {src => course-registration-app/src}/main/java/com/university/Student.java (100%)
 rename {src => course-registration-app/src}/test/java/com/university/CourseTest.java (100%)
 rename {src => course-registration-app/src}/test/java/com/university/RegistrationServiceTest.java (100%)
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ ls
course-registration-app  pom.xml  src
```

---

## Task 3: RegistrationService.java Fix & Unit Tests

* **RegistrationService.java Fix:** Implemented proper registration rules and validation logic.
* **Added Required Unit Tests:** Expanded `RegistrationServiceTest.java` to thoroughly test validation edge cases.

### Maven Clean Test:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn clean test
...
[INFO] T E S T S
[INFO] ------------------------------------------------------------------------
[INFO] Running com.university.RegistrationServiceTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 s -- in com.university.RegistrationServiceTest
[INFO] Running com.university.CourseTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s -- in com.university.CourseTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... SUCCESS [  0.063 s]
[INFO] Course Registration Application .................... SUCCESS [  0.744 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.848 s
[INFO] Finished at: 2026-10-13T10:13:29+05:30
[INFO] ------------------------------------------------------------------------
```

---

## Task 4: Credit Limit Change

* **Credit Limit Change:** Updated `MAX_CREDITS` from `20` to `24` inside `RegistrationService.java`.

### Rerunning Unit Tests:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ mvn clean test
...
[INFO] Running com.university.RegistrationServiceTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.022 s -- in com.university.RegistrationServiceTest
[INFO] Running com.university.CourseTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in com.university.CourseTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... SUCCESS [  0.069 s]
[INFO] Course Registration Application .................... SUCCESS [  0.749 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.862 s
[INFO] Finished at: 2026-10-13T10:15:31+05:30
[INFO] ------------------------------------------------------------------------
```

---

## Task 5: Creating Jenkinsfile

### Starting Minikube & Committing Jenkinsfile:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ sudo cat /var/lib/jenkins/secrets/initialAdminPassword
[sudo] password for snucse:
e4bf8db9126c44a9a28f0780578c40f0
^C
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ touch Jenkinsfile
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ minikube start
✨   minikube v1.39.0 on Ubuntu 22.04
💡   Using the kvm2 driver based on existing profile
👍   Starting "minikube" primary control-plane node in "minikube" cluster
🔄   Restarting existing kvm2 VM for "minikube" ...
📦   Preparing Kubernetes v1.37.0 on containerd 2.3.4 ...
🌐   Configuring bridge CNI (Container Networking Interface) ...
🎛️   Verifying Kubernetes components...
    ▪ Using image gcr.io/k8s-minikube/storage-provisioner:v5
👤   Enabled addons: default-storageclass, storage-provisioner

⚠️   /usr/bin/kubectl is version 1.34.12, which may have incompatibilities with Kubernetes 1.37.0.
💡   Want kubectl v1.37.0? Try 'minikube kubectl -- get pods -A'
🏄   Done! kubectl is now configured to use "minikube" cluster and "default" namespace by default
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ touch deployment.yaml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git add Jenkinsfile
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git commit -m "Task 5: Jenkinsfile Commit"
[feature/course-registration-refactor d2b9c63] Task 5: Jenkinsfile Commit
 1 file changed, 43 insertions(+)
 create mode 100644 Jenkinsfile
```

---

## Task 6: Kubernetes Setup & YAML Files

### Service.yaml Creation and Commit:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ touch service.yaml
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git add .
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ git commit -m "Task 6: YAML files"
[feature/course-registration-refactor 9491515] Task 6: YAML files
 2 files changed, 33 insertions(+)
 create mode 100644 deployment.yaml
 create mode 100644 service.yaml
```

### Apply Configs and Verify Deployment:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl apply -f deployment.yaml
deployment.apps/nginx-deployment created
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl apply -f service.yaml
service/nginx-service created
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl get pods
NAME                                READY   STATUS    RESTARTS   AGE
nginx-deployment-75cc477c85-cvjjk   1/1     Running   0          23s
nginx-deployment-75cc477c85-t5t6v   1/1     Running   0          23s
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl get services
NAME            TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)        AGE
kubernetes      ClusterIP   10.96.0.1        <none>        443/TCP        7d22h
nginx-service   NodePort    10.106.224.220   <none>        80:31704/TCP   22s
```

### Scaling and Self Healing:
```
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl scale deployment nginx-deployment --replicas=3
deployment.apps/nginx-deployment scaled
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl get pods
NAME                                READY   STATUS    RESTARTS   AGE
nginx-deployment-75cc477c85-cvjjk   1/1     Running   0          3m51s
nginx-deployment-75cc477c85-t5t6v   1/1     Running   0          3m51s
nginx-deployment-75cc477c85-xvnvp   1/1     Running   0          7s
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl delete pod nginx-deployment-t5t6v
pod "nginx-deployment-t5t6v" deleted from default namespace
snucse@snucse-HP-Pro-Tower-400-G9-PCI-Desktop-PC:~/Downloads/Student-Starter$ kubectl get pods
NAME                                READY   STATUS    RESTARTS   AGE
nginx-deployment-75cc477c85-4jmhb   1/1     Running   0          21s
nginx-deployment-75cc477c85-cvjjk   1/1     Running   0          5m17s
nginx-deployment-75cc477c85-xvnvp   1/1     Running   0          93s
```

---

## Task 7: Setup And Execution Instructions

* **Build and Test:** `mvn clean test`
* **Package:** `mvn package`
* **Kubernetes Deployment:** 
  ```bash
  kubectl apply -f deployment.yaml 
  kubectl apply -f service.yaml
  ```

### Git Evidence:
* **Feature Branch Name:** `feature/course-registration-refactor`
* **Commit History:**
  * `9491515` (HEAD -> feature/course-registration-refactor) Task 6: YAML files
  * `d2b9c63` Task 5: Jenkinsfile Commit
  * `6929bc6` Task 3: Indentation Mistake
  * `5300b37` Task 3: Fixed Mistake in new unit tests
  * `74fbd4c` Task 3: Resolved Error and added Unit Tests
  * `371db89` Refactored default project repo into multi module Maven structure
  * `cef2bff` Initial student assessment starter

### Maven Evidence:
* **Parent-Child POM Structure:** Parent POM manages shared compiler settings and JUnit 5 dependency versions. Child module `course-registration-app` inherits configuration. Reactor successfully builds both modules.

### Build Results:
```
[INFO] Course Registration Application                                    [jar]
[INFO] 
[INFO] ----------< com.example:course-registration-parent >----------
[INFO] Building Course Registration Parent POM 1.0-SNAPSHOT               [1/2]
[INFO]   from pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] ----------< com.example:course-registration-app >----------
[INFO] Building Course Registration Application 1.0-SNAPSHOT               [2/2]
[INFO]   from course-registration-app/pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] --- resources:3.4.0:resources (default-resources) @ course-registration-app ---
[INFO] skip non existing resourceDirectory /home/snucse/Downloads/Student-Starter/course-registration-app/src/main/resources
[INFO] --- compiler:3.12.1:compile (default-compile) @ course-registration-app ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] --- resources:3.4.0:testResources (default-testResources) @ course-registration-app ---
[INFO] skip non existing resourceDirectory /home/snucse/Downloads/Student-Starter/course-registration-app/src/test/resources
[INFO] --- compiler:3.12.1:testCompile (default-testCompile) @ course-registration-app ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] --- surefire:3.2.5:test (default-test) @ course-registration-app ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] T E S T S
[INFO] ------------------------------------------------------------------------
[INFO] Running com.university.RegistrationServiceTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.023 s -- in com.university.RegistrationServiceTest
[INFO] Running com.university.CourseTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in com.university.CourseTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] --- jar:3.5.0:jar (default-jar) @ course-registration-app ---
[INFO] Building jar: /home/snucse/Downloads/Student-Starter/course-registration-app/target/course-registration-app-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Course Registration Parent POM 1.0-SNAPSHOT:
[INFO] Course Registration Parent POM ..................... SUCCESS [  0.000 s]
[INFO] Course Registration Application .................... SUCCESS [  0.748 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.788 s
[INFO] Finished at: 2026-10-13T10:55:26+05:30
[INFO] ------------------------------------------------------------------------
```

---

## Jenkins Pipeline Explanation

### Jenkinsfile:
```groovy
pipeline {
   agent any
   stages {
       stage('Checkout') {
           steps {
               checkout scm
           }
       }
       stage('Build & Test') {
           steps {
               // Execute Maven from the repository root
               sh 'mvn clean test'
           }
           post {
               always {
                   // Publish JUnit reports from the child module location
                   junit 'course-registration-app/target/surefire-reports/TEST-*.xml'
               }
           }
       }
       stage('Package') {
           steps {
               // Package the application into the jar
               sh 'mvn package -DskipTests'
           }
           post {
               success {
                   // Archive packaged artifact if tests pass
                   archiveArtifacts artifacts: 'course-registration-app/target/*.jar', fingerprint: true
               }
           }
       }
   }
   post {
       failure {
           echo 'Pipeline failed. Packaging and artifact archiving were prevented.'
       }
   }
}
```

* Jenkins uses Linux `sh` steps to execute stages. It publishes test reports via `junit`.
* Sample command: `junit 'course-registration-app/target/surefire-reports/TEST-*.xml'`
* It archives artifacts only on successful pipeline builds.

---

## Kubernetes Deployment Evidence

### deployment.yaml:
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
 name: nginx-deployment
 labels:
   app: nginx
spec:
 replicas: 2
 selector:
   matchLabels:
     app: nginx
 template:
   metadata:
     labels:
       app: nginx
   spec:
     containers:
     - name: nginx
       image: nginx:1.27
       ports:
       - containerPort: 80
```

### service.yaml:
```yaml
apiVersion: v1
kind: Service
metadata:
 name: nginx-service
spec:
 type: NodePort
 selector:
   app: nginx
 ports:
  - port: 80
    targetPort: 80
```

---

## Change Summary and Limitations

* **Bug Resolved:** Capacity check error fixed.
* **Change Request Completed:** Capacity increased from 20 to 24.
* **Full Pipeline Set Up:** Maven, Jenkins, and Kubernetes fully configured for the project.

### Limitations:
* Done only on a local minikube environment.
* Docker not used at all for the project.