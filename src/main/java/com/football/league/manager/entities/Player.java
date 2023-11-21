package com.football.league.manager.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor( force = true )
@Table( name = "player" )
@Entity( name = "PlayerEntity" )
public class Player
{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "playerIdSeq" )
    @SequenceGenerator( name = "playerIdSeq", sequenceName = "player_id_seq", allocationSize = 1 )
    private Long id;

    @Column( name = "name" )
    private String name;

}
