package Model;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private long id;
    private int version;
    private LocalDateTime createdAt;
    private LocalDateTime modifierAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifierAt() {
        return modifierAt;
    }

    public void setModifierAt(LocalDateTime modifierAt) {
        this.modifierAt = modifierAt;
    }
}
