../mvnw clean package
../mvnw sonar:sonar \
  -Dsonar.projectKey=io.codebyexample:unit-test-mockito \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=085cd163dc027c2f62aba8cf165608817c8f5f05
