# Safe City

# front-end
Local para subir o front-end: C:\Workspace\safecity\src\main\ui\safecity-react	\
(baseado que o projeto esteja em c:\Workspace) \
Comando: `npm start` \
[http://localhost:3000](http://localhost:3000) \
Obs: Projeto front em REACT dentro do projeto em java spring \
Só foi acertado o código front referente a criação de categorias, referente a \
reclamaçoes ainda esta em criação. \
(apenas categoria já supri o exigido, com telas e todo o "CRUD" funcionando no fluxo `REACT e JAVA`). 

# back-end
O projeto necessita de um banco mongo db \
As configurações são feitas no arquivo: application.properties \
Localizado em: C:\Workspace\safecity\src\main\resources\ \
(baseado que o projeto esteja em c:\Workspace) \
Configurado para subir na porta `8082` (Se alterar quebra o front) \

Ao subir o projeto executar a classe de teste InsertBanco \
Localizado em: C:\Workspace\safecity\src\test\java\br\com\safecity\insert \
(baseado que o projeto esteja em c:\Workspace) \
Comando: Clicar com botão direito em cima da classe -> Run As -> `JUnit test` \
Obs: o mesmo irá inserir no banco os registros para teste. \


# obs.:
1ª Etapa: Projeto em front RECT telas categoria, home(filtro) & reclamações \
2ª Etapa: Consulta e cadastro (C.R.U.D.) verificar no CategoriaController \
3ª Etapa: Telas do react referente a categoria funcionando corretamente 

# postman
Inserir categoria : http://localhost:8082/safecity/v1/categorias  \
Localizar todas cat : http://localhost:8082/safecity/v1/categorias  \
Alterar categoria : http://localhost:8082/safecity/v1/categorias/1  \
Deletar categoria : http://localhost:8082/safecity/v1/categorias/1  

# Swagger

http://localhost:8082/safecity/swagger-ui.html
