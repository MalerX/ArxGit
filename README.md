# ArxGit
Пока все на потом. Сейчас просто смотрим TODO (в Idea слева снизу)

Кароч надо сделать так:
  1. провентилировать возможность запретить принимать мерджи, но оставить возможность их создавать. Предварительно: гитхаб требует бабла за такие вещи. Гитлаб надо смотреть. Задача №1 - найти гитовый сервис с такими возможностями (гитлаб должен уметь на самом деле)
  2. Сервис авторизуется в гите
  3. Сервис периодически пингует гит на предмет новых МР. при появлении - мессагу всем, кроме создателя МР о том, что требуется кодревью
  4. Сервис проверяет имеющиеся МР по правилам. Правила должны включать:
    
    4.1. Имя ветки. Возможно имеет смысл уметь подсовывать регулярки
    4.2. Количество аппрувов. Пока просто число
    4.3. Кодревью должен быть зарезолвлен
  
  5. Если МР прошел проверки, то сервис принимает его и отсылает мессагу всем участникам о необходимости синхронизации в веткой-респондентом
  6. стопудово че-нить еще навертим, но пока так
