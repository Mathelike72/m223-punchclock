package ch.zli.m223.model;

import javax.persistence.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Entity
public class entry_tags {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  @Column(name= "entrytag_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name="id")
  private Entry entry_id;

  @ManyToOne
  @JoinColumn(name="id")
  private tag tag_id;
  
}