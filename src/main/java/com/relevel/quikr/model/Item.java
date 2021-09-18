package com.relevel.quikr.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private long item_id;
}
