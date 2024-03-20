package com.example.Java.Entity;

import java.time.LocalDateTime;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.Java.Utils.PasswordUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter@Setter
@Table(name = "utilisateur")
public class Utilisateur {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
    @Column(name = "password", nullable = false)
    private String password; // Encrypted password will be stored
    
    @Column(name = "createddate", nullable = false)
    private LocalDateTime createdDate;
    
    @Column(name = "lastconnection", nullable = false)
    private LocalDateTime lastConnection;
    
    @Column(name = "roleid")
    private Integer roleId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleid", referencedColumnName = "id", insertable = false, updatable = false)
    private Role role;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "territoryid", referencedColumnName = "id")
    private Territory territory;
    
	public Utilisateur() {
	}
	
	

	public Utilisateur(Long id, String name, Integer territoryId, String email, String password,
			LocalDateTime createdDate, LocalDateTime lastConnection, Role role, Territory territory) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.createdDate = createdDate;
		this.lastConnection = lastConnection;
		this.role = role;
		this.territory = territory;
	}
	
	public Utilisateur(String name, String email, String password, LocalDateTime createdDate) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.createdDate = createdDate;
	}
	
	public Utilisateur(String name, String email, String password,String role,Territory territory) {
		super();
		this.name = name;
		this.createdDate = LocalDateTime.now();
		this.lastConnection = LocalDateTime.now();
		if(role.equals("admin")) {
            this.roleId = 1;
		} else {
			this.roleId = 2;
		}
		this.email = email;
		this.password = password;
		this.territory=territory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Territory getTerritory() {
		return territory;
	}

	public void setTerritory(Territory territory) {
		this.territory = territory;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public LocalDateTime getLastConnection() {
		return lastConnection;
	}
	
	public void setLastConnection(LocalDateTime lastConnection) {
		this.lastConnection = lastConnection;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}



	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", name=" + name + ", territoryId=" +", email=" + email
				+ ", password=" + password + ", createdDate=" + createdDate + ", lastConnection=" + lastConnection
				+ ", roleId=" + roleId + ", role=" + role + ", territory=" + territory + "]";
	}
	
	
	
}
