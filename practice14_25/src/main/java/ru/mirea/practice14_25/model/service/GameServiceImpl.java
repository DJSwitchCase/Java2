package ru.mirea.practice14_25.model.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.practice14_25.model.entity.Game;
import ru.mirea.practice14_25.model.repository.GameRepository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class GameServiceImpl implements GameService {
    public final GameRepository gameRepository;
//    private SessionFactory sessionFactory;
//    private Session session;

    @PersistenceContext
    EntityManager em;

//    {
//        assert sessionFactory != null;
//        em = sessionFactory.createEntityManager();
//    }
//    @PostConstruct
//    public void init(){
//        this.session = sessionFactory.openSession();
//    }

//    CriteriaBuilder cb = this.em.getCriteriaBuilder();
//    CriteriaQuery<Game> gameCriteriaQuery = cb.createQuery(Game.class);
//    Root<Game> root = gameCriteriaQuery.from(Game.class);

    public ArrayList<Game> sort() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Game> gameCriteriaQuery = cb.createQuery(Game.class);
        Root<Game> root = gameCriteriaQuery.from(Game.class);
        gameCriteriaQuery.select(root).orderBy(cb.asc(root.get("name")));
        //Query<Game> query = (Query<Game>) em.createQuery(gameCriteriaQuery);
        return (ArrayList<Game>) em.createQuery(gameCriteriaQuery).getResultList();

    }

    //CriteriaBuilder builder;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    // Хранилище клиентов
    ///private static final Map<Integer, Level> LEVEL_REPOSITORY_MAP = new HashMap<>();
    // Переменная для генерации ID клиента
    ///private static final AtomicInteger LEVEL_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Game game) {
        ///    final int levelId = LEVEL_ID_HOLDER.incrementAndGet();
        ///    level.setId(levelId);
        ///    LEVEL_REPOSITORY_MAP.put(levelId, level);
        gameRepository.save(game);
    }

    @Override
    public List<Game> readAll() {
        ///return new ArrayList<>(LEVEL_REPOSITORY_MAP.values());
        return gameRepository.findAll();
    }

    @Override
    public Game read(int id) {
        ///return LEVEL_REPOSITORY_MAP.get(id);
        return gameRepository.getById(id);
    }

    @Override
    public boolean update(Game game, int id) {
        ///if (LEVEL_REPOSITORY_MAP.containsKey(id)){
        if (gameRepository.existsById(id)) {
            game.setId(id);
            ///LEVEL_REPOSITORY_MAP.put(id, level);
            gameRepository.save(game);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        ///return LEVEL_REPOSITORY_MAP.remove(id) != null;
        if (gameRepository.existsById(id)) {
            gameRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
