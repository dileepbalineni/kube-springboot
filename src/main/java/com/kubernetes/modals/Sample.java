package com.kubernetes.modals;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "sample_table")
@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
public class Sample {

	@Id
	@Builder.Default
	private String id = UUID.randomUUID().toString();

	private String name;

	private String description;

	private String image;

}
