using System.Collections;
using System.Collections.Generic;
using System.Runtime.ConstrainedExecution;
using Unity.VisualScripting;
using UnityEngine;

public class CharacterController : MonoBehaviour
{
    [SerializeField] private float speed = 2f;
    [SerializeField] private float jumpForce = 50f;
    private Rigidbody2D _rigidBody2D;
    private Animator _animator;

    private bool grounded;
    private bool started;
    private bool jumping;

    private void Awake()
    {
        _rigidBody2D = GetComponent<Rigidbody2D>(); //catching
        _animator = GetComponent<Animator>();
        grounded = true;
    }
    private void Update()
    {
        if (Input.GetKeyDown("space")) {
            if (started && grounded)
            {
                _animator.SetTrigger("jump");
                grounded = false;
                jumping = true;
            }
            else
            {
                _animator.SetBool("gameStarted", true);
                started = true;
            }
        }
        
            _animator.SetBool("grounded", grounded);
        
    }
    private void FixedUpdate()
    {
        if (started)
        {
            _rigidBody2D.velocity = new Vector2(speed, _rigidBody2D.velocity.y);

        }
        if (jumping)
        {
            Debug.Log("Jumping");
            _rigidBody2D.AddForce(new Vector2(0f, jumpForce));
            jumping = false; //zýpladýk
        }

    }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("ground"))
        {
            grounded=true;
        }
    }
}

