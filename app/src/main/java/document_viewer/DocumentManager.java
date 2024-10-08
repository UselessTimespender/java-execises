package document_viewer;

import java.util.List;

/**
 * Реализовать потокобезопасный менеджер документов,
 * который будет хранить документы в себе и предоставлять юзерам возможности:
 *  - UserRole.VIEWER может посмотреть список всех документов и содержимое документа по имени
 *  - UserRole.WRITER может все, что и VIEWER + редактировать документ (добавлять/удалять/заменять символы)
 *  - UserRole.ADMIN может все, что и VIEWER + WRITER + /добавить/удалить документ
*/
public class DocumentManager {
    private static final int MAX_PARALLEL_MODIFYING_USERS_PER_DOCUMENT = 5;

    /**
     * вернуть все документы, подразумевается, что их будут только смотреть,
     * модификация будет идти через modifyDocument(...)
     * */
    public List<Document> getDocuments(User user) {
        return null;
    }

    /**
     * одновременный просмотр документов не ограничен кол-вом юзеров
     * также один юзер может одновременно просматривать несколько документов
     * */
    public Document getDocument(User user, String documentName) {
        return null;
    }

    /**
     * одновременно один документ могут редактировать ${{@value MAX_PARALLEL_MODIFYING_USERS_PER_DOCUMENT}
     */
    public void modifyDocument(User user, String documentName, ModifyCommand command) {}

    public void addDocument(User user, Document document) {}

    /**
     * удалить документ можно только если его сейчас никто не модифицирует
     */
    public void removeDocument(User user, String documentName) {}
}
