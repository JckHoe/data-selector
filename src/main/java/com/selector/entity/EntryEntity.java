package com.selector.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "entry")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EntryEntity extends BaseEntity<UUID> {
    @Column(name = "code")
    private String code;
    @Column(name = "entry_key")
    private String entryKey;
    @Column(name = "entry_value")
    private String entryValue;
}
